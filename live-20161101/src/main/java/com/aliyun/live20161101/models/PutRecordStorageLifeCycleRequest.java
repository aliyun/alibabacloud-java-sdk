// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PutRecordStorageLifeCycleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stream-xxx</p>
     */
    @NameInMap("StreamIds")
    public java.util.List<String> streamIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1095days</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1758621407</p>
     */
    @NameInMap("UnixTimestamp")
    public Long unixTimestamp;

    public static PutRecordStorageLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutRecordStorageLifeCycleRequest self = new PutRecordStorageLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public PutRecordStorageLifeCycleRequest setStreamIds(java.util.List<String> streamIds) {
        this.streamIds = streamIds;
        return this;
    }
    public java.util.List<String> getStreamIds() {
        return this.streamIds;
    }

    public PutRecordStorageLifeCycleRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public PutRecordStorageLifeCycleRequest setUnixTimestamp(Long unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
        return this;
    }
    public Long getUnixTimestamp() {
        return this.unixTimestamp;
    }

}
