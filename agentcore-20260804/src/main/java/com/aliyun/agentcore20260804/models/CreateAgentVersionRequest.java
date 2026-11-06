// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentVersionRequest extends TeaModel {
    /**
     * <p>保存版本的请求体。</p>
     */
    @NameInMap("body")
    public CreateAgentVersionRequestBody body;

    /**
     * <p>客户端生成的幂等令牌，当前为预留参数，后端暂不提供持久化幂等保证。</p>
     * 
     * <strong>example:</strong>
     * <p>c2d8a6f0-3b1e-4a7d-9f25-6e4b0c1a8d37</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateAgentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentVersionRequest self = new CreateAgentVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentVersionRequest setBody(CreateAgentVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentVersionRequestBody getBody() {
        return this.body;
    }

    public CreateAgentVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateAgentVersionRequestBody extends TeaModel {
        /**
         * <p>版本描述，最多 1024 个字符，保存后不可修改。</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境稳定版本</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>用户自定义的展示名称，去除首尾空白后为 1 至 128 个字符，可包含中文、大小写字母、空格和标点，不能包含控制字符。同一 Agent 下未删除的版本名称唯一，区分大小写，保存后不可修改。版本号 agentVersion 由系统生成，不由此字段决定。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>生产稳定版 V1.0</p>
         */
        @NameInMap("versionName")
        public String versionName;

        public static CreateAgentVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentVersionRequestBody self = new CreateAgentVersionRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateAgentVersionRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAgentVersionRequestBody setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
