// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FileUploadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0r2LSuIsHlxEoGZcnGe34U1njBOR83Q4HNSvMDGrDPK5J71VjcGdRIWz2x3+tFxvQaduwHB46Z9K
     * dbIoDN8xPQ5PWlky8rKOPmAqSZfIRyPmAwvPvTJFwr8bRgHPPaq2VO8kHJ6jFIpJJ5I7Zqd1BjGS
     * SR/kULQZHsDDd2zgA9RRTsEQF2OSxFFFx2P/2Q==</p>
     */
    @NameInMap("file_content")
    public String fileContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>496***2617111</p>
     */
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
