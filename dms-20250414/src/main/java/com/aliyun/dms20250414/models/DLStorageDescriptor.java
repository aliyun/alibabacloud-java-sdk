// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLStorageDescriptor extends TeaModel {
    @NameInMap("BucketCols")
    public java.util.List<String> bucketCols;

    @NameInMap("Columns")
    public java.util.List<DLColumn> columns;

    /**
     * <strong>example:</strong>
     * <p>org.apache.hadoop.mapred.SequenceFileInputFormat</p>
     */
    @NameInMap("InputFormat")
    public String inputFormat;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCompressed")
    public Boolean isCompressed;

    /**
     * <strong>example:</strong>
     * <p>oss://xxx</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("NumBuckets")
    public Integer numBuckets;

    @NameInMap("OriginalColumns")
    public java.util.List<DLColumn> originalColumns;

    /**
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <strong>example:</strong>
     * <p>key/value</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("SerdeInfo")
    public DLSerdeInfo serdeInfo;

    @NameInMap("SkewedInfo")
    public DLSkewedInfo skewedInfo;

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
