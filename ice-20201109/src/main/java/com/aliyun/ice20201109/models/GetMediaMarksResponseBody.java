// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaMarksResponseBody extends TeaModel {
    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The queried marks.</p>
     * <ul>
     * <li>The value is in the JSONArray format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *  {
     *  &quot;MarkStartTime&quot;: &quot;12.1&quot;,
     *  &quot;MarkEndTime&quot;: &quot;12.2&quot;,
     *  &quot;MarkTag&quot;: &quot;tag-1&quot;,
     *  &quot;MarkContent&quot;: &quot;content-1&quot;,
     *  &quot;MarkStatus&quot;: &quot;a&quot;
     *  },
     *  {
     *  &quot;MarkStartTime&quot;: &quot;12.3&quot;,
     *  &quot;MarkEndTime&quot;: &quot;12.4&quot;,
     *  &quot;MarkTag&quot;: &quot;tag-2&quot;,
     *  &quot;MarkContent&quot;: &quot;content-2&quot;,
     *  &quot;MarkStatus&quot;: &quot;online&quot;
     *  }
     * ]</p>
     */
    @NameInMap("MediaMarks")
    public String mediaMarks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMarksResponseBody self = new GetMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaMarksResponseBody setMediaMarks(String mediaMarks) {
        this.mediaMarks = mediaMarks;
        return this;
    }
    public String getMediaMarks() {
        return this.mediaMarks;
    }

    public GetMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
