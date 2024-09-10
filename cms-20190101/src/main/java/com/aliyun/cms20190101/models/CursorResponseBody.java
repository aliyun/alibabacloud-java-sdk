// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Cursor is used as an input parameter for data export in the <a href="https://help.aliyun.com/document_detail/2329847.html">BatchExport</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>v2.5eyJiYXRjaGVzIjoxLCJidWNrZXRCeXRlcyI6IndBPT0iLCJidWNrZXRzIjo0LCJjdXJyZW50QnVja2V0IjotNjQsImN1cnJlbnRUYXJnZXRUaW1lU2xvdCI6MTY3ODc1MjAwMCwiZW5kVGltZSI6MTY3ODc4MjQxOTAwMCwiZXhwb3J0RW5kVGltZSI6MTY3ODc4MjQxOTAwMCwiZXhwb3J0U3RhcnRUaW1lIjoxNjc4NzgxODE5MDAwLCJleHByZXNzUmFuZ2UiOmZhbHNlLCJoYXNOZXh0Ijp0cnVlLCJpbmRleCI6MCwibGF0ZXN0TG9nVGltZSI6MCwibWF0Y2hlcnMiOnsiY2hhaW4iOlt7ImxhYmVsIjoidXNlcklkIiwib3BlcmF0b3IiOiJFUVVBTFMiLCJ2YWx1ZSI6IjEyNzA2NzY2Nzk1NDY3MDQifV0sImxvY2tlZCI6dHJ1ZX0sIm1ldHJpYyI6IlNwbGl0cndQcm94eU1heFJlc3BvbnNlU2l6ZSIsIm1ldHJpY1R5cGUiOiJNRVRSSUMiLCJuYW1lc3BhY2UiOiJhY3Nfa3ZzdG9yZV9leCIsIm5leHRQa0FkYXB0ZXIiOnsiZGltIjoiVjowXG5EOmB1c2VySWRgPTEyNzA2NzY2Nzk1NDY3MDQsYGluc3RhbmNlSWRgPXItcmo5ZjlzMTlsc3V1MXd1bnVyLGBub2RlSWRgPXItcmo5ZjlzMTlsc3V1MXd1bnVyLXByb3h5LTIsXG4iLCJtZXRhIjoiXG5WOjBcbk06YWNzX2t2c3RvcmVfZXgvU3BsaXRyd1Byb3h5TWF4UmVzcG9uc2VTaXplXG5XOjYwXG5COjRcbkk6LTFcblQ6MFxuQzpgQXZlcmFnZWAsYE1heGltdW1gLGBfX2NvdW50X19gLGBfX3RzX19gXG4iLCJyZCI6InN1YkFMU0RwWXY2K0t6aENQQUFBWkErNUFKMEpjbGErRGd2V0hFNWxDSHMvbGtqR2FXYTFJTkVwdFE9PSIsInRhZyI6IiJ9LCJvZmZzZXQiOjAsIm9mZnNldERpZ2l0Ijo0NTU0NTczNDQyMTc4NDIxMjIsInN0YXJ0VGltZSI6MTY3ODc4MTgxOTAwMCwic3RlcCI6LTEsInRhZ01hdGNoZXJzIjp7ImNoYWluIjpbXSwibG9ja2VkIjp0cnVlfSwidGFyZ2V0VGltZVNsb3RzIjpbMTY3ODY2NTYwMCwxNjc4NzUyMDAwXSwidXVpZCI6ImQwMmFhZmY1LWU3ZGQtNDUyYy0***********</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>915C2D7A-E6A4-17C3-8E13-4DBDD61E7919</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CursorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CursorResponseBody self = new CursorResponseBody();
        return TeaModel.build(map, self);
    }

    public CursorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CursorResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public CursorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CursorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CursorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
