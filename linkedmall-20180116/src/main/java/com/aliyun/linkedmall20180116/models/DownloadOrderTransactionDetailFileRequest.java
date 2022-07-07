// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadOrderTransactionDetailFileRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RecordId")
    public String recordId;

    public static DownloadOrderTransactionDetailFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadOrderTransactionDetailFileRequest self = new DownloadOrderTransactionDetailFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadOrderTransactionDetailFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownloadOrderTransactionDetailFileRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
