// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocItem extends TeaModel {
    /**
     * <p>Related document information.</p>
     */
    @NameInMap("docInfo")
    public ChatRefDocInfo docInfo;

    /**
     * <p>Document name. If the original file is of types like doc, it will be converted to PDF for easier document location. This file should be used for document location information.</p>
     * 
     * <strong>example:</strong>
     * <p>a.pdf</p>
     */
    @NameInMap("docName")
    public String docName;

    /**
     * <p>Document link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://carbon-aidoc.oss-accelerate.aliyuncs.com/jobs/42dbc7-3a9e-4e18-8939-3fd2d247bd3c/document/97178d94c75941d3b932883c810c5e.pdf">https://carbon-aidoc.oss-accelerate.aliyuncs.com/jobs/42dbc7-3a9e-4e18-8939-3fd2d247bd3c/document/97178d94c75941d3b932883c810c5e.pdf</a></p>
     */
    @NameInMap("docUrl")
    public String docUrl;

    /**
     * <p>Original document name.</p>
     * 
     * <strong>example:</strong>
     * <p>a.doc</p>
     */
    @NameInMap("originDocName")
    public String originDocName;

    /**
     * <p>Original document link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://carbon-aidoc.oss-accelerate.aliyuncs.com/jobs/42dbc7-3a9e-4e18-8939-3fd2d247bd3c/document/97178d94c75941d3b932883c810c5e.doc">https://carbon-aidoc.oss-accelerate.aliyuncs.com/jobs/42dbc7-3a9e-4e18-8939-3fd2d247bd3c/document/97178d94c75941d3b932883c810c5e.doc</a></p>
     */
    @NameInMap("originDocUrl")
    public String originDocUrl;

    /**
     * <p>Page number information.</p>
     */
    @NameInMap("pageNum")
    public java.util.List<ChatDocumentPageNum> pageNum;

    /**
     * <p>Return file type: \&quot;doc\&quot; for document files, \&quot;web\&quot; for internet information.</p>
     * 
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ChatRefDocItem build(java.util.Map<String, ?> map) throws Exception {
        ChatRefDocItem self = new ChatRefDocItem();
        return TeaModel.build(map, self);
    }

    public ChatRefDocItem setDocInfo(ChatRefDocInfo docInfo) {
        this.docInfo = docInfo;
        return this;
    }
    public ChatRefDocInfo getDocInfo() {
        return this.docInfo;
    }

    public ChatRefDocItem setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public ChatRefDocItem setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public ChatRefDocItem setOriginDocName(String originDocName) {
        this.originDocName = originDocName;
        return this;
    }
    public String getOriginDocName() {
        return this.originDocName;
    }

    public ChatRefDocItem setOriginDocUrl(String originDocUrl) {
        this.originDocUrl = originDocUrl;
        return this;
    }
    public String getOriginDocUrl() {
        return this.originDocUrl;
    }

    public ChatRefDocItem setPageNum(java.util.List<ChatDocumentPageNum> pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public java.util.List<ChatDocumentPageNum> getPageNum() {
        return this.pageNum;
    }

    public ChatRefDocItem setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
