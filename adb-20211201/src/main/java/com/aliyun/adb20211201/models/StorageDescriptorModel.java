// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StorageDescriptorModel extends TeaModel {
    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("InputFormat")
    public String inputFormat;

    @NameInMap("Location")
    public String location;

    @NameInMap("NumBuckets")
    public Long numBuckets;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("SdId")
    public Long sdId;

    @NameInMap("SerDeInfo")
    public SerDeInfoModel serDeInfo;

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
