// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ShareOptions extends TeaModel {
    /**
     * <p>The maximum number of catalogs.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("catalogSizeLimit")
    public Integer catalogSizeLimit;

    /**
     * <p>The maximum number of recipients.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("receiverSizeLimit")
    public Integer receiverSizeLimit;

    /**
     * <p>The maximum shared resource count.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("shareResourceSizeLimit")
    public Integer shareResourceSizeLimit;

    /**
     * <p>The maximum number of shares.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("shareSizeLimit")
    public Integer shareSizeLimit;

    public static ShareOptions build(java.util.Map<String, ?> map) throws Exception {
        ShareOptions self = new ShareOptions();
        return TeaModel.build(map, self);
    }

    public ShareOptions setCatalogSizeLimit(Integer catalogSizeLimit) {
        this.catalogSizeLimit = catalogSizeLimit;
        return this;
    }
    public Integer getCatalogSizeLimit() {
        return this.catalogSizeLimit;
    }

    public ShareOptions setReceiverSizeLimit(Integer receiverSizeLimit) {
        this.receiverSizeLimit = receiverSizeLimit;
        return this;
    }
    public Integer getReceiverSizeLimit() {
        return this.receiverSizeLimit;
    }

    public ShareOptions setShareResourceSizeLimit(Integer shareResourceSizeLimit) {
        this.shareResourceSizeLimit = shareResourceSizeLimit;
        return this;
    }
    public Integer getShareResourceSizeLimit() {
        return this.shareResourceSizeLimit;
    }

    public ShareOptions setShareSizeLimit(Integer shareSizeLimit) {
        this.shareSizeLimit = shareSizeLimit;
        return this;
    }
    public Integer getShareSizeLimit() {
        return this.shareSizeLimit;
    }

}
