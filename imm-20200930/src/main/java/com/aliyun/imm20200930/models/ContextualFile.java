// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualFile extends TeaModel {
    /**
     * <p>The Multipurpose Internet Mail Extensions (MIME) type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>text/x-imm-faq</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>Elements.</p>
     */
    @NameInMap("Elements")
    public java.util.List<Element> elements;

    /**
     * <p>The media type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The URI path of the OSS file. This parameter is used only when the URI is a PDS address.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("OSSURI")
    public String OSSURI;

    /**
     * <p>The identifier of the file in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>0939d7ed-73fa-4009-bbe6-fbbe07b92b2e</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1482910009923706</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URI of the file.
     * The format of an OSS URI is oss\://${bucketname}/${objectname}. ${bucketname} is the name of an OSS bucket in the same region as the current project. ${objectname} is the file path.
     * The format of a PDS URI is pds\://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket</p>
     */
    @NameInMap("URI")
    public String URI;

    public static ContextualFile build(java.util.Map<String, ?> map) throws Exception {
        ContextualFile self = new ContextualFile();
        return TeaModel.build(map, self);
    }

    public ContextualFile setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ContextualFile setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ContextualFile setElements(java.util.List<Element> elements) {
        this.elements = elements;
        return this;
    }
    public java.util.List<Element> getElements() {
        return this.elements;
    }

    public ContextualFile setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ContextualFile setOSSURI(String OSSURI) {
        this.OSSURI = OSSURI;
        return this;
    }
    public String getOSSURI() {
        return this.OSSURI;
    }

    public ContextualFile setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ContextualFile setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ContextualFile setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ContextualFile setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
