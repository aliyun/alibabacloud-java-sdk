// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class CreateTextFileAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e9a93201-7e96-4dc1-9678-2832fc132d08</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1714476549</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("TextFileName")
    public String textFileName;

    @NameInMap("TextFileUrl")
    public java.io.InputStream textFileUrlObject;

    public static CreateTextFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTextFileAdvanceRequest self = new CreateTextFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateTextFileAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTextFileAdvanceRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateTextFileAdvanceRequest setTextFileName(String textFileName) {
        this.textFileName = textFileName;
        return this;
    }
    public String getTextFileName() {
        return this.textFileName;
    }

    public CreateTextFileAdvanceRequest setTextFileUrlObject(java.io.InputStream textFileUrlObject) {
        this.textFileUrlObject = textFileUrlObject;
        return this;
    }
    public java.io.InputStream getTextFileUrlObject() {
        return this.textFileUrlObject;
    }

}
