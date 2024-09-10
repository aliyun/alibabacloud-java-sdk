// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorSLSGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the Logstore group.</p>
     * <p>For information about how to obtain the name of a Logstore group, see <a href="https://help.aliyun.com/document_detail/429526.html">DescribeHybridMonitorSLSGroup</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Logstore_test</p>
     */
    @NameInMap("SLSGroupName")
    public String SLSGroupName;

    public static DeleteHybridMonitorSLSGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorSLSGroupRequest self = new DeleteHybridMonitorSLSGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorSLSGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteHybridMonitorSLSGroupRequest setSLSGroupName(String SLSGroupName) {
        this.SLSGroupName = SLSGroupName;
        return this;
    }
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

}
