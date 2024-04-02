// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateKeywordResponseBody extends TeaModel {
    @NameInMap("InvalidKeywordList")
    public java.util.List<String> invalidKeywordList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("validKeywordList")
    public java.util.List<CreateKeywordResponseBodyValidKeywordList> validKeywordList;

    public static CreateKeywordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeywordResponseBody self = new CreateKeywordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeywordResponseBody setInvalidKeywordList(java.util.List<String> invalidKeywordList) {
        this.invalidKeywordList = invalidKeywordList;
        return this;
    }
    public java.util.List<String> getInvalidKeywordList() {
        return this.invalidKeywordList;
    }

    public CreateKeywordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKeywordResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public CreateKeywordResponseBody setValidKeywordList(java.util.List<CreateKeywordResponseBodyValidKeywordList> validKeywordList) {
        this.validKeywordList = validKeywordList;
        return this;
    }
    public java.util.List<CreateKeywordResponseBodyValidKeywordList> getValidKeywordList() {
        return this.validKeywordList;
    }

    public static class CreateKeywordResponseBodyValidKeywordList extends TeaModel {
        @NameInMap("id")
        public Integer id;

        @NameInMap("keyword")
        public String keyword;

        public static CreateKeywordResponseBodyValidKeywordList build(java.util.Map<String, ?> map) throws Exception {
            CreateKeywordResponseBodyValidKeywordList self = new CreateKeywordResponseBodyValidKeywordList();
            return TeaModel.build(map, self);
        }

        public CreateKeywordResponseBodyValidKeywordList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public CreateKeywordResponseBodyValidKeywordList setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

    }

}
