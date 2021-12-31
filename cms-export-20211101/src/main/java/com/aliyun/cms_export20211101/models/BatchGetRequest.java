// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms_export20211101.models;

import com.aliyun.tea.*;

public class BatchGetRequest extends TeaModel {
    @NameInMap("CompressionType")
    public String compressionType;

    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RecordKeyWhiteList")
    public String recordKeyWhiteList;

    public static BatchGetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetRequest self = new BatchGetRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetRequest setCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    public String getCompressionType() {
        return this.compressionType;
    }

    public BatchGetRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public BatchGetRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public BatchGetRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public BatchGetRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchGetRequest setRecordKeyWhiteList(String recordKeyWhiteList) {
        this.recordKeyWhiteList = recordKeyWhiteList;
        return this;
    }
    public String getRecordKeyWhiteList() {
        return this.recordKeyWhiteList;
    }

}
