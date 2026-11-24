// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StorageDescriptorModel extends TeaModel {
    /**
     * <p>Specifies whether the data is compressed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Compressed")
    public Boolean compressed;

    /**
     * <p>The input format.</p>
     * 
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
     */
    @NameInMap("InputFormat")
    public String inputFormat;

    /**
     * <p>The storage location.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://**************</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The number of buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NumBuckets")
    public Long numBuckets;

    /**
     * <p>The output format.</p>
     * 
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>The storage configuration parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>The storage ID of the description.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SdId")
    public Long sdId;

    /**
     * <p>The serialization and deserialization sequence information.</p>
     */
    @NameInMap("SerDeInfo")
    public SerDeInfoModel serDeInfo;

    /**
     * <p>Specifies whether the data is stored in subdirectories.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StoredAsSubDirectories")
    public Boolean storedAsSubDirectories;

    public static StorageDescriptorModel build(java.util.Map<String, ?> map) throws Exception {
        StorageDescriptorModel self = new StorageDescriptorModel();
        return TeaModel.build(map, self);
    }

    public StorageDescriptorModel setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public StorageDescriptorModel setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }
    public String getInputFormat() {
        return this.inputFormat;
    }

    public StorageDescriptorModel setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public StorageDescriptorModel setNumBuckets(Long numBuckets) {
        this.numBuckets = numBuckets;
        return this;
    }
    public Long getNumBuckets() {
        return this.numBuckets;
    }

    public StorageDescriptorModel setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public StorageDescriptorModel setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public StorageDescriptorModel setSdId(Long sdId) {
        this.sdId = sdId;
        return this;
    }
    public Long getSdId() {
        return this.sdId;
    }

    public StorageDescriptorModel setSerDeInfo(SerDeInfoModel serDeInfo) {
        this.serDeInfo = serDeInfo;
        return this;
    }
    public SerDeInfoModel getSerDeInfo() {
        return this.serDeInfo;
    }

    public StorageDescriptorModel setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
        return this;
    }
    public Boolean getStoredAsSubDirectories() {
        return this.storedAsSubDirectories;
    }

}
