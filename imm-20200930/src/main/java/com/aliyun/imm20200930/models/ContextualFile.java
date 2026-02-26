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
     * <p>Name of the dataset</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>Elements</p>
     */
    @NameInMap("Elements")
    public java.util.List<Element> elements;

    /**
     * <p>Media type of the current file</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>image</li>
     * <li>other</li>
     * <li>document</li>
     * <li>archive</li>
     * <li>audio</li>
     * <li>video</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The URI of the OSS object. This parameter is available only if the value of the URI parameter is the URI of a file in Photo and Drive Service.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("OSSURI")
    public String OSSURI;

    /**
     * <p>The identifier of the corresponding file that exists in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>0939d7ed-73fa-4009-bbe6-fbbe07b92b2e</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>User ID</p>
     * 
     * <strong>example:</strong>
     * <p>1482910009923706</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Name of the project</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>URI of the file. Specify the OSS URI in the oss://${bucketname}/${objectname} format, where ${bucketname} is the name of the bucket in the same region as the current project and ${objectname} is the path of the object. The URI of a file in Photo and Drive Service follows the pds://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision} format.</p>
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
