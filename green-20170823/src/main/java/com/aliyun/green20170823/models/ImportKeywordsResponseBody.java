// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ImportKeywordsResponseBody extends TeaModel {
    @NameInMap("InvalidKeywordList")
    public java.util.List<String> invalidKeywordList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("validKeywordList")
    public java.util.List<String> validKeywordList;

    public static ImportKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportKeywordsResponseBody self = new ImportKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportKeywordsResponseBody setInvalidKeywordList(java.util.List<String> invalidKeywordList) {
        this.invalidKeywordList = invalidKeywordList;
        return this;
    }
    public java.util.List<String> getInvalidKeywordList() {
        return this.invalidKeywordList;
    }

    public ImportKeywordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportKeywordsResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public ImportKeywordsResponseBody setValidKeywordList(java.util.List<String> validKeywordList) {
        this.validKeywordList = validKeywordList;
        return this;
    }
    public java.util.List<String> getValidKeywordList() {
        return this.validKeywordList;
    }

}
