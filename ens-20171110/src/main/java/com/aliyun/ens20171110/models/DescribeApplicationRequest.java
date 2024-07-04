// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplications operation to obtain the application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2bac6f4-75dc-455e-8389-2dc8e47526d3</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The version number of the application. Separate multiple version numbers with commas (,). If you want to query data of all versions of applications, specify All for this parameter. By default, only data of applications in the stable versions are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>v1,v2</p>
     */
    @NameInMap("AppVersions")
    public String appVersions;

    /**
     * <p>The region level by which edge resources of the application are collected. The value is of the enumeration type. Valid values:</p>
     * <ul>
     * <li>National: Chinese mainland</li>
     * <li>Big: area</li>
     * <li>Middle: province</li>
     * <li>Small: city</li>
     * <li>RegionId: edge node</li>
     * </ul>
     * <p>Default value: National.</p>
     * 
     * <strong>example:</strong>
     * <p>National</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>Specifies whether to return other information about the application, such as statistics on resource instances and pods. The value must be a JSON string. By default, all information is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;appInfo\&quot;:true,\&quot;detailStat\&quot;: true, \&quot;appVersionStat\&quot;: true, \&quot;districtStat\&quot;:true ,\&quot;instanceStat\&quot;: true, \&quot;podCountStat\&quot;: true}</p>
     */
    @NameInMap("OutDetailStatParams")
    public String outDetailStatParams;

    /**
     * <p>The resource filter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;regionCode\&quot;: \&quot;cn-wuxi-telecom_unicom_cmcc-3\&quot;,    \&quot;ispCode\&quot;: \&quot;telecom\&quot;,    \&quot;count\&quot;: 2	},{    \&quot;regionCode\&quot;: \&quot;cn-shanghai-cmcc\&quot;,    \&quot;count\&quot;: 4	}]</p>
     */
    @NameInMap("ResourceSelector")
    public String resourceSelector;

    public static DescribeApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationRequest self = new DescribeApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationRequest setAppVersions(String appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public String getAppVersions() {
        return this.appVersions;
    }

    public DescribeApplicationRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeApplicationRequest setOutDetailStatParams(String outDetailStatParams) {
        this.outDetailStatParams = outDetailStatParams;
        return this;
    }
    public String getOutDetailStatParams() {
        return this.outDetailStatParams;
    }

    public DescribeApplicationRequest setResourceSelector(String resourceSelector) {
        this.resourceSelector = resourceSelector;
        return this;
    }
    public String getResourceSelector() {
        return this.resourceSelector;
    }

}
