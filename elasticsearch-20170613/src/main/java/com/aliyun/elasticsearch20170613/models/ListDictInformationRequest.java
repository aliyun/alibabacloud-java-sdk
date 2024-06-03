// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictInformationRequest extends TeaModel {
    @NameInMap("analyzerType")
    public String analyzerType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    public static ListDictInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDictInformationRequest self = new ListDictInformationRequest();
        return TeaModel.build(map, self);
    }

    public ListDictInformationRequest setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public ListDictInformationRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListDictInformationRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
