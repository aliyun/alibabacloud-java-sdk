// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductExtendProperty extends TeaModel {
    /**
     * <p>The property key.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><ul>
     * <li><code>ss_picture_scene</code> (scene picture)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>ss_picture_white_background</code> (white background picture)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>extraPeriod</code> (shelf life)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>itemBoundaryInventoryZeroTag</code> (Reserved. Ignore this parameter.)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>shoppingShowTitle</code> (shopping guide title)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>itemCCStatus</code> (Reserved. Ignore this parameter.)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>brandLogo</code> (brand logo)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>multipleBuyLimit</code> (purchase multiple)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>eticket_type</code> (electronic coupon type)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>eticket_upper_buy_limit</code> (maximum purchase quantity of electronic coupons per order)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>validity_type</code> (validity period type of electronic coupon)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>etc_expiry_date</code> (Validity period of the electronic coupon. Valid only when <code>validity_type</code> is <code>1</code>.)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>etc_duration_date</code> (Validity period of the electronic coupon. Valid only when <code>validity_type</code> is <code>2</code>, <code>3</code>, or <code>5</code>.)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>f_refund</code> (Automatic refund ratio for valid electronic coupons)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>refund</code> (automatic refund ratio for expired electronic coupons)</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><code>writeoff</code> (Reserved. Ignore this parameter.)</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss_picture_scene</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The property value.</p>
     * 
     * <strong>example:</strong>
     * <p>场景图</p>
     */
    @NameInMap("value")
    public String value;

    public static ProductExtendProperty build(java.util.Map<String, ?> map) throws Exception {
        ProductExtendProperty self = new ProductExtendProperty();
        return TeaModel.build(map, self);
    }

    public ProductExtendProperty setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ProductExtendProperty setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
