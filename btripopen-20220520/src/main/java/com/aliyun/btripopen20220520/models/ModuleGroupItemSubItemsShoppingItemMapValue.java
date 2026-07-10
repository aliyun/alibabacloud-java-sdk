// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleGroupItemSubItemsShoppingItemMapValue extends TeaModel {
    @NameInMap("search_price")
    public ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice searchPrice;

    public static ModuleGroupItemSubItemsShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleGroupItemSubItemsShoppingItemMapValue self = new ModuleGroupItemSubItemsShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleGroupItemSubItemsShoppingItemMapValue setSearchPrice(ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public static class ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice extends TeaModel {
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("tax")
        public Integer tax;

        public static ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice self = new ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleGroupItemSubItemsShoppingItemMapValueSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

    }

}
