// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDatasetShrinkRequest extends TeaModel {
    /**
     * <p>The description of the dataset. It must not exceed 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li>COMMON: Common (Default)</li>
     * <li>PIC</li>
     * <li>TEXT</li>
     * <li>TABLE</li>
     * <li>VIDEO</li>
     * <li>AUDIO</li>
     * <li>INDEX</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The initial version of the dataset.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InitVersion")
    public String initVersionShrink;

    /**
     * <p>The name of the dataset. It cannot be an empty string and must not exceed 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_oss_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source of the dataset. Currently, only DataWorks is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The storage type. Currently supported values:</p>
     * <ul>
     * <li>OSS</li>
     * <li>NAS: General-purpose NAS file systems</li>
     * <li>EXTREMENAS: Extreme NAS file systems</li>
     * <li>DLF_LANCE: Data Lake Formation</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>NAS: General-purpose NAS file systems</li>
     * <li>MAXCOMPUTE: MaxCompute table</li>
     * <li>CPFS: Cloud Parallel File Storage</li>
     * <li>BMCPFS: CPFS for Lingjun</li>
     * <li>EXTREMENAS: Extreme NAS file systems</li>
     * <li>OSS: Object Storage Service</li>
     * <li>DLF_LANCE: Data Lake Formation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static CreateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetShrinkRequest self = new CreateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatasetShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDatasetShrinkRequest setInitVersionShrink(String initVersionShrink) {
        this.initVersionShrink = initVersionShrink;
        return this;
    }
    public String getInitVersionShrink() {
        return this.initVersionShrink;
    }

    public CreateDatasetShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasetShrinkRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateDatasetShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDatasetShrinkRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
