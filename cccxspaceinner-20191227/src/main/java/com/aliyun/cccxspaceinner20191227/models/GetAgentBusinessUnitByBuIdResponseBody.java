// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentBusinessUnitByBuIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetAgentBusinessUnitByBuIdResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentBusinessUnitByBuIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBusinessUnitByBuIdResponseBody self = new GetAgentBusinessUnitByBuIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentBusinessUnitByBuIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentBusinessUnitByBuIdResponseBody setData(GetAgentBusinessUnitByBuIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentBusinessUnitByBuIdResponseBodyData getData() {
        return this.data;
    }

    public GetAgentBusinessUnitByBuIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentBusinessUnitByBuIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentBusinessUnitByBuIdResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("BuKey")
        public String buKey;

        @NameInMap("Extra")
        public java.util.Map<String, ?> extra;

        public static GetAgentBusinessUnitByBuIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentBusinessUnitByBuIdResponseBodyData self = new GetAgentBusinessUnitByBuIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentBusinessUnitByBuIdResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetAgentBusinessUnitByBuIdResponseBodyData setBuKey(String buKey) {
            this.buKey = buKey;
            return this;
        }
        public String getBuKey() {
            return this.buKey;
        }

        public GetAgentBusinessUnitByBuIdResponseBodyData setExtra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

    }

}
