// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerEipInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ChinaTelecom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static DescribeWuyingServerEipInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerEipInfoRequest self = new DescribeWuyingServerEipInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerEipInfoRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeWuyingServerEipInfoRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
