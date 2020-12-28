// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageDescriptor extends TeaModel {
    @NameInMap("BucketCols")
    public java.util.List<String> bucketCols;

    // Cols
    @NameInMap("Cols")
    public java.util.List<FieldSchema> cols;

    // Compressed
    @NameInMap("Compressed")
    public Boolean compressed;

    // InputFormat
    @NameInMap("InputFormat")
    public String inputFormat;

    // Location
    @NameInMap("Location")
    public String location;

    // NumBuckets
    @NameInMap("NumBuckets")
    public Integer numBuckets;

    // OutputFormat
    @NameInMap("OutputFormat")
    public String outputFormat;

    // Parameters
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("SerDeInfo")
    public SerDeInfo serDeInfo;

    @NameInMap("SkewedInfo")
    public SkewedInfo skewedInfo;

    // SortCols
    @NameInMap("SortCols")
    public java.util.List<Order> sortCols;

    // StoredAsSubDirectories
    @NameInMap("StoredAsSubDirectories")
    public Boolean storedAsSubDirectories;

    public static StorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
        StorageDescriptor self = new StorageDescriptor();
        return TeaModel.build(map, self);
    }

    public StorageDescriptor setBucketCols(java.util.List<String> bucketCols) {
        this.bucketCols = bucketCols;
        return this;
    }
    public java.util.List<String> getBucketCols() {
        return this.bucketCols;
    }

    public StorageDescriptor setCols(java.util.List<FieldSchema> cols) {
        this.cols = cols;
        return this;
    }
    public java.util.List<FieldSchema> getCols() {
        return this.cols;
    }

    public StorageDescriptor setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public StorageDescriptor setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }
    public String getInputFormat() {
        return this.inputFormat;
    }

    public StorageDescriptor setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public StorageDescriptor setNumBuckets(Integer numBuckets) {
        this.numBuckets = numBuckets;
        return this;
    }
    public Integer getNumBuckets() {
        return this.numBuckets;
    }

    public StorageDescriptor setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public StorageDescriptor setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public StorageDescriptor setSerDeInfo(SerDeInfo serDeInfo) {
        this.serDeInfo = serDeInfo;
        return this;
    }
    public SerDeInfo getSerDeInfo() {
        return this.serDeInfo;
    }

    public StorageDescriptor setSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }
    public SkewedInfo getSkewedInfo() {
        return this.skewedInfo;
    }

    public StorageDescriptor setSortCols(java.util.List<Order> sortCols) {
        this.sortCols = sortCols;
        return this;
    }
    public java.util.List<Order> getSortCols() {
        return this.sortCols;
    }

    public StorageDescriptor setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
        return this;
    }
    public Boolean getStoredAsSubDirectories() {
        return this.storedAsSubDirectories;
    }

}
