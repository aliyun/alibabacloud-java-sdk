// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLStorageDescriptor extends TeaModel {
    /**
     * <p>The list of bucket column names, which determines the distribution of stored data based on hashes.</p>
     */
    @NameInMap("BucketCols")
    public java.util.List<String> bucketCols;

    /**
     * <p>The description of the data columns.</p>
     */
    @NameInMap("Columns")
    public java.util.List<DLColumn> columns;

    /**
     * <p>The name of the input format class that is used to read data.</p>
     * 
     * <strong>example:</strong>
     * <p>org.apache.hadoop.mapred.SequenceFileInputFormat</p>
     */
    @NameInMap("InputFormat")
    public String inputFormat;

    /**
     * <p>Specifies whether the stored data is compressed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCompressed")
    public Boolean isCompressed;

    /**
     * <p>The location where the data is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://xxx</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The number of buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("NumBuckets")
    public Integer numBuckets;

    /**
     * <p>The description of the original column.</p>
     */
    @NameInMap("OriginalColumns")
    public java.util.List<DLColumn> originalColumns;

    /**
     * <p>The name of the output format class that is used to write data.</p>
     * 
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>Other parameter mappings of data storage.</p>
     * 
     * <strong>example:</strong>
     * <p>key/value</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The information about how to perform data serialization and deserialization.</p>
     */
    @NameInMap("SerdeInfo")
    public DLSerdeInfo serdeInfo;

    /**
     * <p>The information about the skewed column.</p>
     */
    @NameInMap("SkewedInfo")
    public DLSkewedInfo skewedInfo;

    /**
     * <p>The description of the column based on which you want to sort query results.</p>
     */
    @NameInMap("SortCols")
    public java.util.List<DLOrder> sortCols;

    public static DLStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
        DLStorageDescriptor self = new DLStorageDescriptor();
        return TeaModel.build(map, self);
    }

    public DLStorageDescriptor setBucketCols(java.util.List<String> bucketCols) {
        this.bucketCols = bucketCols;
        return this;
    }
    public java.util.List<String> getBucketCols() {
        return this.bucketCols;
    }

    public DLStorageDescriptor setColumns(java.util.List<DLColumn> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<DLColumn> getColumns() {
        return this.columns;
    }

    public DLStorageDescriptor setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }
    public String getInputFormat() {
        return this.inputFormat;
    }

    public DLStorageDescriptor setIsCompressed(Boolean isCompressed) {
        this.isCompressed = isCompressed;
        return this;
    }
    public Boolean getIsCompressed() {
        return this.isCompressed;
    }

    public DLStorageDescriptor setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DLStorageDescriptor setNumBuckets(Integer numBuckets) {
        this.numBuckets = numBuckets;
        return this;
    }
    public Integer getNumBuckets() {
        return this.numBuckets;
    }

    public DLStorageDescriptor setOriginalColumns(java.util.List<DLColumn> originalColumns) {
        this.originalColumns = originalColumns;
        return this;
    }
    public java.util.List<DLColumn> getOriginalColumns() {
        return this.originalColumns;
    }

    public DLStorageDescriptor setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public DLStorageDescriptor setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DLStorageDescriptor setSerdeInfo(DLSerdeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
        return this;
    }
    public DLSerdeInfo getSerdeInfo() {
        return this.serdeInfo;
    }

    public DLStorageDescriptor setSkewedInfo(DLSkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }
    public DLSkewedInfo getSkewedInfo() {
        return this.skewedInfo;
    }

    public DLStorageDescriptor setSortCols(java.util.List<DLOrder> sortCols) {
        this.sortCols = sortCols;
        return this;
    }
    public java.util.List<DLOrder> getSortCols() {
        return this.sortCols;
    }

}
