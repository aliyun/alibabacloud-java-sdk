// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("ZoneList")
    public java.util.List<String> zoneList;

    public static DescribeCcZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcZonesResponseBody self = new DescribeCcZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcZonesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeCcZonesResponseBody setZoneList(java.util.List<String> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<String> getZoneList() {
        return this.zoneList;
    }

}
