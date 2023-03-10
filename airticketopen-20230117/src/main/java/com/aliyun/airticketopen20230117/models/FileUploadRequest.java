// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FileUploadRequest extends TeaModel {
    @NameInMap("file_content")
    public String fileContent;

    @NameInMap("order_num")
    public Long orderNum;

    public static FileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        FileUploadRequest self = new FileUploadRequest();
        return TeaModel.build(map, self);
    }

    public FileUploadRequest setFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public String getFileContent() {
        return this.fileContent;
    }

    public FileUploadRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

}
