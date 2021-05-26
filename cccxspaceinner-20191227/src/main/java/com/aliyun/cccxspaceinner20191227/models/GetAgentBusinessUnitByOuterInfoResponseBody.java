// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentBusinessUnitByOuterInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetAgentBusinessUnitByOuterInfoResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentBusinessUnitByOuterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBusinessUnitByOuterInfoResponseBody self = new GetAgentBusinessUnitByOuterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentBusinessUnitByOuterInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentBusinessUnitByOuterInfoResponseBody setData(GetAgentBusinessUnitByOuterInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentBusinessUnitByOuterInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAgentBusinessUnitByOuterInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentBusinessUnitByOuterInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentBusinessUnitByOuterInfoResponseBodyData extends TeaModel {
        @NameInMap("buName")
        public String buName;

        @NameInMap("buId")
        public Long buId;

        @NameInMap("buKey")
        public String buKey;

        public static GetAgentBusinessUnitByOuterInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentBusinessUnitByOuterInfoResponseBodyData self = new GetAgentBusinessUnitByOuterInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentBusinessUnitByOuterInfoResponseBodyData setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public GetAgentBusinessUnitByOuterInfoResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetAgentBusinessUnitByOuterInfoResponseBodyData setBuKey(String buKey) {
            this.buKey = buKey;
            return this;
        }
        public String getBuKey() {
            return this.buKey;
        }

    }

}
