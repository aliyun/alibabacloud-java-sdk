// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetConversationDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Phrases")
    public java.util.List<GetConversationDetailResponseBodyPhrases> phrases;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConversationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversationDetailResponseBody self = new GetConversationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversationDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConversationDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConversationDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConversationDetailResponseBody setPhrases(java.util.List<GetConversationDetailResponseBodyPhrases> phrases) {
        this.phrases = phrases;
        return this;
    }
    public java.util.List<GetConversationDetailResponseBodyPhrases> getPhrases() {
        return this.phrases;
    }

    public GetConversationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConversationDetailResponseBodyPhrases extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Role")
        public String role;

        @NameInMap("Words")
        public String words;

        public static GetConversationDetailResponseBodyPhrases build(java.util.Map<String, ?> map) throws Exception {
            GetConversationDetailResponseBodyPhrases self = new GetConversationDetailResponseBodyPhrases();
            return TeaModel.build(map, self);
        }

        public GetConversationDetailResponseBodyPhrases setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public GetConversationDetailResponseBodyPhrases setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public GetConversationDetailResponseBodyPhrases setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetConversationDetailResponseBodyPhrases setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetConversationDetailResponseBodyPhrases setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

}
