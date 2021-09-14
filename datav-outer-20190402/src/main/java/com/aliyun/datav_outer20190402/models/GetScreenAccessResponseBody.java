// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenAccessResponseBody extends TeaModel {
    @NameInMap("Preview")
    public String preview;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Share")
    public String share;

    @NameInMap("Edit")
    public String edit;

    public static GetScreenAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScreenAccessResponseBody self = new GetScreenAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScreenAccessResponseBody setPreview(String preview) {
        this.preview = preview;
        return this;
    }
    public String getPreview() {
        return this.preview;
    }

    public GetScreenAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScreenAccessResponseBody setShare(String share) {
        this.share = share;
        return this;
    }
    public String getShare() {
        return this.share;
    }

    public GetScreenAccessResponseBody setEdit(String edit) {
        this.edit = edit;
        return this;
    }
    public String getEdit() {
        return this.edit;
    }

}
