// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackByIpRequest extends TeaModel {
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("Ip")
    public String ip;

    public static DescribeBgpPackByIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackByIpRequest self = new DescribeBgpPackByIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackByIpRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeBgpPackByIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
