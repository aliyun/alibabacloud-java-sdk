// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    @NameInMap("docId")
    public Long docId;

    @NameInMap("name")
    public String name;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("url")
    public String url;

    @NameInMap("uploadTime")
    public String uploadTime;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("applyId")
    public String applyId;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setDocId(Long docId) {
        this.docId = docId;
        return this;
    }
    public Long getDocId() {
        return this.docId;
    }

    public DataValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataValue setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DataValue setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DataValue setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public String getUploadTime() {
        return this.uploadTime;
    }

    public DataValue setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DataValue setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

}
