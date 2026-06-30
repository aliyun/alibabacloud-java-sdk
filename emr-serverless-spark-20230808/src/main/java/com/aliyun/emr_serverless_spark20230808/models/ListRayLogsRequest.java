// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayLogsRequest extends TeaModel {
    /**
     * <p>The bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>mybucket</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <p>The character used to group object names. All objects whose names contain the specified prefix and between which the delimiter character appears for the first time are grouped as a set of elements (CommonPrefixes).</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("delimiter")
    public String delimiter;

    /**
     * <p>The marker after which the returned objects are listed in alphabetical order.</p>
     * 
     * <strong>example:</strong>
     * <p>test1.txt</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of objects to return. If the listing cannot be completed in a single request due to the max-keys setting, a NextMarker element is included in the response as the marker for the next listing request.</p>
     * <p>Valid values: greater than 0 and less than 1000.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxKeys")
    public Long maxKeys;

    /**
     * <p>The prefix that the keys of the returned files must start with.</p>
     * 
     * <strong>example:</strong>
     * <p>/w-xxxxxxx/ray/logs/rj-xxxxxxxxxx_default/</p>
     */
    @NameInMap("prefix")
    public String prefix;

    public static ListRayLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRayLogsRequest self = new ListRayLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListRayLogsRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListRayLogsRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListRayLogsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListRayLogsRequest setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListRayLogsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
