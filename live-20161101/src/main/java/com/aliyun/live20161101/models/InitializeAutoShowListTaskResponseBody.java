// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class InitializeAutoShowListTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <blockquote>
     * <p> The value of this parameter can be used as the value of a request parameter to query the streaming URL of the production studio, start the production studio, add video resources to the production studio, add a production studio layout, query production studio layouts, add a production studio component, and add a production studio playlist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b4810848-bcf9-4aef-bd4a-e6bba2d9****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of output video streams.</p>
     * <ul>
     * <li>videoFormat: the format of the streaming URL.</li>
     * <li>outputStreamUrl: the source URL.</li>
     * <li>transcodeConfig: the output resolution specified for video transcoding of the source URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;videoFormat&quot;:&quot;flv&quot;,&quot;outputStreamUrl&quot;:&quot;<a href="http://example.aliyundoc.com%22,%22transcodeConfig%22:%22original%22%7D%5D">http://example.aliyundoc.com&quot;,&quot;transcodeConfig&quot;:&quot;original&quot;}]</a></p>
     */
    @NameInMap("StreamList")
    public String streamList;

    public static InitializeAutoShowListTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeAutoShowListTaskResponseBody self = new InitializeAutoShowListTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeAutoShowListTaskResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public InitializeAutoShowListTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeAutoShowListTaskResponseBody setStreamList(String streamList) {
        this.streamList = streamList;
        return this;
    }
    public String getStreamList() {
        return this.streamList;
    }

}
