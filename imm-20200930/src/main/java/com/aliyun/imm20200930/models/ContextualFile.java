// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualFile extends TeaModel {
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Elements")
    public java.util.List<Element> elements;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OSSURI")
    public String OSSURI;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ProjectName")
    public String projectName;

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
