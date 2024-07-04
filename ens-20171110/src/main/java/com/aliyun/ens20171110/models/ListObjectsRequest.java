// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListObjectsRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The token used in this list operation. If the number of objects exceeds the value of MaxKeys, the NextContinuationToken is included in the response as the token for the next list operation.</p>
     * 
     * <strong>example:</strong>
     * <p>test1.txt</p>
     */
    @NameInMap("ContinuationToken")
    public String continuationToken;

    /**
     * <p>The encoding type of the object names in the response. Only URL encoding is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("EncodingType")
    public String encodingType;

    /**
     * <p>The position from which the list operation starts. If this parameter is specified, objects whose names are alphabetically greater than value of Marker are returned. The Marker parameter is used to list the returned objects by page, and its value must be smaller than 1,024 bytes in length.</p>
     * <p>Even if the value specified for Marker does not exist in the list during a conditional query, the list starts from the object whose name is alphabetically greater than the value of Marker.</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The maximum number of objects to return. Valid values: 0 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxKeys")
    public Long maxKeys;

    /**
     * <p>The prefix that must be included in the names of objects you want to list. If you specify a prefix to query objects, the returned object names contain the prefix.</p>
     * <p>The value of the parameter must be less than 1,000 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>b</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The position from which the list operation starts. If this parameter is specified, objects whose names are alphabetically greater than the value of StartAfter are returned. The StartAfter parameter is used to list the returned objects by page, and its value must be less than 1,000 bytes in length. Even if the value specified for StartAfter does not exist in the list during a conditional query, the list starts from the object whose name is alphabetically greater than the value of StartAfter.</p>
     * 
     * <strong>example:</strong>
     * <p>b</p>
     */
    @NameInMap("StartAfter")
    public String startAfter;

    public static ListObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsRequest self = new ListObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectsRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListObjectsRequest setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ListObjectsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListObjectsRequest setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectsRequest setStartAfter(String startAfter) {
        this.startAfter = startAfter;
        return this;
    }
    public String getStartAfter() {
        return this.startAfter;
    }

}
