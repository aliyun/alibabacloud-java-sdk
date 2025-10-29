// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PutRecordStorageLifeCycleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stream-xxx</p>
     */
    @NameInMap("StreamIds")
    public String streamIdsShrink;

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

    public static PutRecordStorageLifeCycleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutRecordStorageLifeCycleShrinkRequest self = new PutRecordStorageLifeCycleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutRecordStorageLifeCycleShrinkRequest setStreamIdsShrink(String streamIdsShrink) {
        this.streamIdsShrink = streamIdsShrink;
        return this;
    }
    public String getStreamIdsShrink() {
        return this.streamIdsShrink;
    }

    public PutRecordStorageLifeCycleShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public PutRecordStorageLifeCycleShrinkRequest setUnixTimestamp(Long unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
        return this;
    }
    public Long getUnixTimestamp() {
        return this.unixTimestamp;
    }

}
