// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceGlobalizationConfigResponseBody extends TeaModel {
    @NameInMap("GlobalizationConfig")
    public GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig globalizationConfig;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceGlobalizationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGlobalizationConfigResponseBody self = new GetInstanceGlobalizationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceGlobalizationConfigResponseBody setGlobalizationConfig(GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig globalizationConfig) {
        this.globalizationConfig = globalizationConfig;
        return this;
    }
    public GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig getGlobalizationConfig() {
        return this.globalizationConfig;
    }

    public GetInstanceGlobalizationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig extends TeaModel {
        /**
         * <p>语言</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans-CN</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>时区</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig self = new GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetInstanceGlobalizationConfigResponseBodyGlobalizationConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
