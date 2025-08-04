// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartAuditRequest extends TeaModel {
    @NameInMap("ImageUrlList")
    public java.util.List<SubmitSmartAuditRequestImageUrlList> imageUrlList;

    @NameInMap("SubCodes")
    public java.util.List<String> subCodes;

    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("imageUrls")
    public java.util.List<SubmitSmartAuditRequestImageUrls> imageUrls;

    public static SubmitSmartAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartAuditRequest self = new SubmitSmartAuditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartAuditRequest setImageUrlList(java.util.List<SubmitSmartAuditRequestImageUrlList> imageUrlList) {
        this.imageUrlList = imageUrlList;
        return this;
    }
    public java.util.List<SubmitSmartAuditRequestImageUrlList> getImageUrlList() {
        return this.imageUrlList;
    }

    public SubmitSmartAuditRequest setSubCodes(java.util.List<String> subCodes) {
        this.subCodes = subCodes;
        return this;
    }
    public java.util.List<String> getSubCodes() {
        return this.subCodes;
    }

    public SubmitSmartAuditRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitSmartAuditRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SubmitSmartAuditRequest setImageUrls(java.util.List<SubmitSmartAuditRequestImageUrls> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<SubmitSmartAuditRequestImageUrls> getImageUrls() {
        return this.imageUrls;
    }

    public static class SubmitSmartAuditRequestImageUrlList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Url")
        public String url;

        public static SubmitSmartAuditRequestImageUrlList build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartAuditRequestImageUrlList self = new SubmitSmartAuditRequestImageUrlList();
            return TeaModel.build(map, self);
        }

        public SubmitSmartAuditRequestImageUrlList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartAuditRequestImageUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SubmitSmartAuditRequestImageUrls extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("url")
        public String url;

        public static SubmitSmartAuditRequestImageUrls build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartAuditRequestImageUrls self = new SubmitSmartAuditRequestImageUrls();
            return TeaModel.build(map, self);
        }

        public SubmitSmartAuditRequestImageUrls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartAuditRequestImageUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
