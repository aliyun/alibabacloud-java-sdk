// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictInformationRequest extends TeaModel {
    @NameInMap("analyzerType")
    public String analyzerType;

    @NameInMap("body")
    public String body;

    @NameInMap("bucketName")
    public String bucketName;

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

    public ListDictInformationRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
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
