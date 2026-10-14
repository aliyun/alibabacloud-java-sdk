// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleApplicationRequest extends TeaModel {
    /**
     * <p>The application ID. You can obtain this value by calling the ListApplications operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The level of the scaling region. Valid values:</p>
     * <ul>
     * <li>AreaIspCode: region ISP.</li>
     * <li>RegionId: edge zone.</li>
     * <li>InstanceId: instance. Scale-out indicates resource hosting. Scale-in indicates resource release.</li>
     * </ul>
     * <p>Default value: AreaIspCode.</p>
     * 
     * <strong>example:</strong>
     * <p>RegionId</p>
     */
    @NameInMap("RescaleLevel")
    public String rescaleLevel;

    /**
     * <p>The scaling action for resources. Valid values:</p>
     * <ul>
     * <li>Add: Provisions new resources.</li>
     * <li>Del: Releases resources.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Add</p>
     */
    @NameInMap("RescaleType")
    public String rescaleType;

    /**
     * <p>The scaling resource requirements. The value is a string in JSON array format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;regionCode\&quot;: \&quot;cn-wuxi-telecom_unicom_cmcc-3\&quot;,    \&quot;ispCode\&quot;: \&quot;telecom\&quot;,    \&quot;count\&quot;: 2	},{    \&quot;regionCode\&quot;: \&quot;cn-shanghai-cmcc\&quot;,    \&quot;count\&quot;: 4	}]</p>
     */
    @NameInMap("ResourceSelector")
    public String resourceSelector;

    /**
     * <p>The timeout period for asynchronous scaling, in seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The application deployment version for new resources. This parameter takes effect only when resources are added. Default value: the stable version number of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("ToAppVersion")
    public String toAppVersion;

    public static RescaleApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationRequest self = new RescaleApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationRequest setRescaleLevel(String rescaleLevel) {
        this.rescaleLevel = rescaleLevel;
        return this;
    }
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    public RescaleApplicationRequest setRescaleType(String rescaleType) {
        this.rescaleType = rescaleType;
        return this;
    }
    public String getRescaleType() {
        return this.rescaleType;
    }

    public RescaleApplicationRequest setResourceSelector(String resourceSelector) {
        this.resourceSelector = resourceSelector;
        return this;
    }
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    public RescaleApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RescaleApplicationRequest setToAppVersion(String toAppVersion) {
        this.toAppVersion = toAppVersion;
        return this;
    }
    public String getToAppVersion() {
        return this.toAppVersion;
    }

}
