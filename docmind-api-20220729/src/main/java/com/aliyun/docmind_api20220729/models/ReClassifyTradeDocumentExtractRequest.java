// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ReClassifyTradeDocumentExtractRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageUpdateInfoModels")
    public java.util.List<ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels> pageUpdateInfoModels;

    public static ReClassifyTradeDocumentExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        ReClassifyTradeDocumentExtractRequest self = new ReClassifyTradeDocumentExtractRequest();
        return TeaModel.build(map, self);
    }

    public ReClassifyTradeDocumentExtractRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReClassifyTradeDocumentExtractRequest setPageUpdateInfoModels(java.util.List<ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels> pageUpdateInfoModels) {
        this.pageUpdateInfoModels = pageUpdateInfoModels;
        return this;
    }
    public java.util.List<ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels> getPageUpdateInfoModels() {
        return this.pageUpdateInfoModels;
    }

    public static class ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels extends TeaModel {
        @NameInMap("AttTypeCode")
        public String attTypeCode;

        @NameInMap("PageId")
        public String pageId;

        public static ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels build(java.util.Map<String, ?> map) throws Exception {
            ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels self = new ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels();
            return TeaModel.build(map, self);
        }

        public ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels setAttTypeCode(String attTypeCode) {
            this.attTypeCode = attTypeCode;
            return this;
        }
        public String getAttTypeCode() {
            return this.attTypeCode;
        }

        public ReClassifyTradeDocumentExtractRequestPageUpdateInfoModels setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

    }

}
