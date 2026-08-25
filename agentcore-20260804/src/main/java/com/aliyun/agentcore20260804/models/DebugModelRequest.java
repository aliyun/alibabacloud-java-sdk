// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DebugModelRequest extends TeaModel {
    @NameInMap("body")
    public DebugModelRequestBody body;

    public static DebugModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugModelRequest self = new DebugModelRequest();
        return TeaModel.build(map, self);
    }

    public DebugModelRequest setBody(DebugModelRequestBody body) {
        this.body = body;
        return this;
    }
    public DebugModelRequestBody getBody() {
        return this.body;
    }

    public static class DebugModelRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("prompt")
        public String prompt;

        public static DebugModelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DebugModelRequestBody self = new DebugModelRequestBody();
            return TeaModel.build(map, self);
        }

        public DebugModelRequestBody setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

    }

}
