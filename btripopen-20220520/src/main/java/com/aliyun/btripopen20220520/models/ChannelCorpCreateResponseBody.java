// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ChannelCorpCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ChannelCorpCreateResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static ChannelCorpCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChannelCorpCreateResponseBody self = new ChannelCorpCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public ChannelCorpCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChannelCorpCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChannelCorpCreateResponseBody setModule(ChannelCorpCreateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ChannelCorpCreateResponseBodyModule getModule() {
        return this.module;
    }

    public ChannelCorpCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChannelCorpCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ChannelCorpCreateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ChannelCorpCreateResponseBodyModule extends TeaModel {
        @NameInMap("administrator_name")
        public String administratorName;

        /**
         * <strong>example:</strong>
         * <p>18378889782</p>
         */
        @NameInMap("administrator_phone")
        public String administratorPhone;

        /**
         * <strong>example:</strong>
         * <p>dingaa15ca45cba9ee744a5</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        /**
         * <strong>example:</strong>
         * <p>open12mplkebufu8701012jq</p>
         */
        @NameInMap("open_agent_id")
        public String openAgentId;

        public static ChannelCorpCreateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ChannelCorpCreateResponseBodyModule self = new ChannelCorpCreateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ChannelCorpCreateResponseBodyModule setAdministratorName(String administratorName) {
            this.administratorName = administratorName;
            return this;
        }
        public String getAdministratorName() {
            return this.administratorName;
        }

        public ChannelCorpCreateResponseBodyModule setAdministratorPhone(String administratorPhone) {
            this.administratorPhone = administratorPhone;
            return this;
        }
        public String getAdministratorPhone() {
            return this.administratorPhone;
        }

        public ChannelCorpCreateResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ChannelCorpCreateResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ChannelCorpCreateResponseBodyModule setOpenAgentId(String openAgentId) {
            this.openAgentId = openAgentId;
            return this;
        }
        public String getOpenAgentId() {
            return this.openAgentId;
        }

    }

}
