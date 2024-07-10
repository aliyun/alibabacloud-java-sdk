// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class CreateTextFileRequest extends TeaModel {
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
    public String textFileUrl;

    public static CreateTextFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTextFileRequest self = new CreateTextFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateTextFileRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTextFileRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateTextFileRequest setTextFileName(String textFileName) {
        this.textFileName = textFileName;
        return this;
    }
    public String getTextFileName() {
        return this.textFileName;
    }

    public CreateTextFileRequest setTextFileUrl(String textFileUrl) {
        this.textFileUrl = textFileUrl;
        return this;
    }
    public String getTextFileUrl() {
        return this.textFileUrl;
    }

}
