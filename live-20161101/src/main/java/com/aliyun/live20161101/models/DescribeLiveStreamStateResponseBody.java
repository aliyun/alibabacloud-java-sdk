// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamStateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6CD79D-0A98-1F22-A15F-FADA74DF2729</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the stream. Valid values:</p>
     * <ul>
     * <li><p>online: The stream is active.</p>
     * </li>
     * <li><p>offline: The stream is offline. This may mean the stream ingest has failed or ended. For specific details, use the data returned by the stream ingest callback. This operation does not provide a detailed breakdown of the offline status.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("StreamState")
    public String streamState;

    /**
     * <p>The stream ingest method. Valid values:</p>
     * <ul>
     * <li><p>push</p>
     * </li>
     * <li><p>pull</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>push</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeLiveStreamStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamStateResponseBody self = new DescribeLiveStreamStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamStateResponseBody setStreamState(String streamState) {
        this.streamState = streamState;
        return this;
    }
    public String getStreamState() {
        return this.streamState;
    }

    public DescribeLiveStreamStateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
