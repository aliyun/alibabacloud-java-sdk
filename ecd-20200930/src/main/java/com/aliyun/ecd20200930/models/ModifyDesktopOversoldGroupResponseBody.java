// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDesktopOversoldGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopOversoldGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldGroupResponseBody self = new ModifyDesktopOversoldGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldGroupResponseBody setData(ModifyDesktopOversoldGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDesktopOversoldGroupResponseBodyData getData() {
        return this.data;
    }

    public ModifyDesktopOversoldGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDesktopOversoldGroupResponseBodyData extends TeaModel {
        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        public static ModifyDesktopOversoldGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopOversoldGroupResponseBodyData self = new ModifyDesktopOversoldGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopOversoldGroupResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

    }

}
