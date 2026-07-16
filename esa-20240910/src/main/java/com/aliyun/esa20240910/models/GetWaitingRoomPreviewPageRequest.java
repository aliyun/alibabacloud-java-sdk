// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWaitingRoomPreviewPageRequest extends TeaModel {
    /**
     * <p>The custom waiting room page content. This parameter is required when the waiting room type is custom. The content must be URL-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello%20world!</p>
     */
    @NameInMap("CustomPageHtml")
    public String customPageHtml;

    public static GetWaitingRoomPreviewPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWaitingRoomPreviewPageRequest self = new GetWaitingRoomPreviewPageRequest();
        return TeaModel.build(map, self);
    }

    public GetWaitingRoomPreviewPageRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

}
