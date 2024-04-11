// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetBusAppConfigResponseBody extends TeaModel {
    @NameInMap("RetCode")
    public Integer retCode;

    @NameInMap("RetMsg")
    public String retMsg;

    @NameInMap("RetValue")
    public GetBusAppConfigResponseBodyRetValue retValue;

    public static GetBusAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBusAppConfigResponseBody self = new GetBusAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBusAppConfigResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public GetBusAppConfigResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public GetBusAppConfigResponseBody setRetValue(GetBusAppConfigResponseBodyRetValue retValue) {
        this.retValue = retValue;
        return this;
    }
    public GetBusAppConfigResponseBodyRetValue getRetValue() {
        return this.retValue;
    }

    public static class GetBusAppConfigResponseBodyRetValue extends TeaModel {
        @NameInMap("Cashier")
        public String cashier;

        @NameInMap("ShoppingBar")
        public String shoppingBar;

        @NameInMap("ShoppingWindow")
        public String shoppingWindow;

        @NameInMap("VipLabel")
        public String vipLabel;

        public static GetBusAppConfigResponseBodyRetValue build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigResponseBodyRetValue self = new GetBusAppConfigResponseBodyRetValue();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigResponseBodyRetValue setCashier(String cashier) {
            this.cashier = cashier;
            return this;
        }
        public String getCashier() {
            return this.cashier;
        }

        public GetBusAppConfigResponseBodyRetValue setShoppingBar(String shoppingBar) {
            this.shoppingBar = shoppingBar;
            return this;
        }
        public String getShoppingBar() {
            return this.shoppingBar;
        }

        public GetBusAppConfigResponseBodyRetValue setShoppingWindow(String shoppingWindow) {
            this.shoppingWindow = shoppingWindow;
            return this;
        }
        public String getShoppingWindow() {
            return this.shoppingWindow;
        }

        public GetBusAppConfigResponseBodyRetValue setVipLabel(String vipLabel) {
            this.vipLabel = vipLabel;
            return this;
        }
        public String getVipLabel() {
            return this.vipLabel;
        }

    }

}
