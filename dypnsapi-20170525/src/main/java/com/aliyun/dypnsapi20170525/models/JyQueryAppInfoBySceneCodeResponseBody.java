// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyQueryAppInfoBySceneCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public JyQueryAppInfoBySceneCodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static JyQueryAppInfoBySceneCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JyQueryAppInfoBySceneCodeResponseBody self = new JyQueryAppInfoBySceneCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public JyQueryAppInfoBySceneCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public JyQueryAppInfoBySceneCodeResponseBody setData(JyQueryAppInfoBySceneCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public JyQueryAppInfoBySceneCodeResponseBodyData getData() {
        return this.data;
    }

    public JyQueryAppInfoBySceneCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JyQueryAppInfoBySceneCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class JyQueryAppInfoBySceneCodeResponseBodyData extends TeaModel {
        @NameInMap("CmAppId")
        public String cmAppId;

        @NameInMap("CmAppKey")
        public String cmAppKey;

        @NameInMap("CtAppId")
        public String ctAppId;

        @NameInMap("CtAppKey")
        public String ctAppKey;

        public static JyQueryAppInfoBySceneCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            JyQueryAppInfoBySceneCodeResponseBodyData self = new JyQueryAppInfoBySceneCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public JyQueryAppInfoBySceneCodeResponseBodyData setCmAppId(String cmAppId) {
            this.cmAppId = cmAppId;
            return this;
        }
        public String getCmAppId() {
            return this.cmAppId;
        }

        public JyQueryAppInfoBySceneCodeResponseBodyData setCmAppKey(String cmAppKey) {
            this.cmAppKey = cmAppKey;
            return this;
        }
        public String getCmAppKey() {
            return this.cmAppKey;
        }

        public JyQueryAppInfoBySceneCodeResponseBodyData setCtAppId(String ctAppId) {
            this.ctAppId = ctAppId;
            return this;
        }
        public String getCtAppId() {
            return this.ctAppId;
        }

        public JyQueryAppInfoBySceneCodeResponseBodyData setCtAppKey(String ctAppKey) {
            this.ctAppKey = ctAppKey;
            return this;
        }
        public String getCtAppKey() {
            return this.ctAppKey;
        }

    }

}
