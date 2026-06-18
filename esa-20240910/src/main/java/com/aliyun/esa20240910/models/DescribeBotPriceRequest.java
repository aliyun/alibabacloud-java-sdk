// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeBotPriceRequest extends TeaModel {
    /**
     * <p>The bot instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_bot</p>
     */
    @NameInMap("BotInstanceLevel")
    public String botInstanceLevel;

    public static DescribeBotPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotPriceRequest self = new DescribeBotPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBotPriceRequest setBotInstanceLevel(String botInstanceLevel) {
        this.botInstanceLevel = botInstanceLevel;
        return this;
    }
    public String getBotInstanceLevel() {
        return this.botInstanceLevel;
    }

}
