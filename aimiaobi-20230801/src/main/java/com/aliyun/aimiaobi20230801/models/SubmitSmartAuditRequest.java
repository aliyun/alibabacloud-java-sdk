// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartAuditRequest extends TeaModel {
    /**
     * <p>Parameters for image audit</p>
     */
    @NameInMap("ImageUrlList")
    public java.util.List<SubmitSmartAuditRequestImageUrlList> imageUrlList;

    /**
     * <p>Rule library ID for rule-based auditing (default: Default)</p>
     * 
     * <strong>example:</strong>
     * <p>note_1_486</p>
     */
    @NameInMap("NoteId")
    public String noteId;

    /**
     * <p>List of sub-audit codes</p>
     */
    @NameInMap("SubCodes")
    public java.util.List<String> subCodes;

    /**
     * <p>Word library name for dictionary-based auditing (default: Default)</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("TermsName")
    public String termsName;

    /**
     * <p>Content to be audited</p>
     * 
     * <strong>example:</strong>
     * <p>“你好呀”</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a></p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>Parameters for image audit (deprecated; use ImageUrlList instead)</p>
     */
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

    public SubmitSmartAuditRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public SubmitSmartAuditRequest setSubCodes(java.util.List<String> subCodes) {
        this.subCodes = subCodes;
        return this;
    }
    public java.util.List<String> getSubCodes() {
        return this.subCodes;
    }

    public SubmitSmartAuditRequest setTermsName(String termsName) {
        this.termsName = termsName;
        return this;
    }
    public String getTermsName() {
        return this.termsName;
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
        /**
         * <p>Unique image identifier</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The URL can be a web link or a base64-encoded string.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.png">http://www.example.com/xxx.png</a></p>
         */
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
        /**
         * <p>Unique image identifier</p>
         * 
         * <strong>example:</strong>
         * <p>3HAZTv62M0vkyz5B</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The URL can be a web link or a base64-encoded string.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/xxx.jpg">https://www.example.com/xxx.jpg</a></p>
         */
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
