// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateFileUploadURLRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSuffix")
    public String fileSuffix;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GenerateFileUploadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadURLRequest self = new GenerateFileUploadURLRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadURLRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public GenerateFileUploadURLRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateFileUploadURLRequest setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }
    public String getFileSuffix() {
        return this.fileSuffix;
    }

    public GenerateFileUploadURLRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
