// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateRequest extends TeaModel {
    /**
     * <p>The vendors to which the template will be submitted. Valid values:</p>
     * <ul>
     * <li><p><strong>HuaWei</strong>: Huawei</p>
     * </li>
     * <li><p><strong>XiaoMi</strong>: Xiaomi</p>
     * </li>
     * <li><p><strong>OPPO</strong>: OPPO</p>
     * </li>
     * <li><p><strong>VIVO</strong>: VIVO</p>
     * </li>
     * <li><p><strong>MEIZU</strong>: MEIZU</p>
     * </li>
     * <li><p><strong>HONOR</strong>: HONOR</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically submits the template to all supported mobile phone vendors.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;HuaWei&quot;,&quot;XiaoMi&quot;]</p>
     */
    @NameInMap("Factorys")
    public String factorys;

    /**
     * <p>A description of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>图文类模板</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <p>The content of the card SMS template.</p>
     * <blockquote>
     * <ul>
     * <li><p>For more information about the <code>Template</code>, <code>ExtendInfo</code>, <code>TemplateContent</code>, <code>TmpCard</code>, and <code>Action</code> fields, see <a href="https://help.aliyun.com/document_detail/434929.html">Card SMS template parameters</a>.</p>
     * </li>
     * <li><p>The content structure varies based on the type of card SMS template. For more information, see <a href="https://help.aliyun.com/document_detail/435361.html">Card SMS template examples</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *        &quot;extendInfo&quot;:{
     *               &quot;scene&quot;:&quot;HMOVM图文&quot;,
     *               &quot;purpose&quot;:&quot;2&quot;,
     *               &quot;userExt&quot;:{
     *                      &quot;outId&quot;:&quot;1234554321&quot;
     *               }
     *        },
     *        &quot;templateContent&quot;:{
     *               &quot;pages&quot;:[
     *                      {
     * &quot;tmpCards&quot;:[
     *                                    {
     *                                           &quot;type&quot;:&quot;IMAGE&quot;,
     *                                           &quot;srcType&quot;:1,
     *                                           &quot;src&quot;:&quot;28755&quot;,
     *                                           &quot;actionType&quot;:&quot;OPEN_APP&quot;,
     *                                           &quot;action&quot;:{
     *                                                  &quot;target&quot;:&quot;<a href="https://s.tb.cn/c.KxzZ">https://s.tb.cn/c.KxzZ</a>&quot;,
     *                                                  &quot;merchantName&quot;:&quot;测试-图文模板&quot;,
     *                                                  &quot;packageName&quot;:[
     *                                                         &quot;com.taobao.taobao&quot;],
     *                                                  &quot;floorUrl&quot;:&quot;<a href="https://s.tb.cn/c.KxzZ">https://s.tb.cn/c.KxzZ</a>&quot;
     *                                           },
     *                                           &quot;positionNumber&quot;:1
     *                                    },
     *                                    {
     *                                           &quot;type&quot;:&quot;TEXT&quot;,
     *                                           &quot;content&quot;:&quot;测试- BENZ AMG 2020 试驾邀请&quot;,
     *                                           &quot;isTextTitle&quot;:true,
     *                                           &quot;positionNumber&quot;:2
     *                                    },
     *                                    {
     *                                           &quot;type&quot;:&quot;TEXT&quot;,
     *                                           &quot;content&quot;:&quot;测试-梅赛德斯-奔驰，创新激情永不灭。作为汽车 XXXX&quot;,
     *                                           &quot;isTextTitle&quot;:false,
     *                                           &quot;positionNumber&quot;:3
     *                                    },
     *                                    {
     *                                           &quot;type&quot;:&quot;BUTTON&quot;,
     *                                           &quot;content&quot;:&quot;预约试驾&quot;,
     *                                           &quot;actionType&quot;:&quot;OPEN_BROWSER&quot;,
     *                                           &quot;action&quot;:{
     *                                                  &quot;target&quot;:&quot;<a href="https://www.mercedes-benz.com.cn">https://www.mercedes-benz.com.cn</a>&quot;,
     *                                                  &quot;merchantName&quot;:&quot;测试-正在跳转梅赛德斯-奔驰&quot;
     * },
     *                                           &quot;positionNumber&quot;:4
     *                                    }]
     *                      }]
     *        },
     *        &quot;cardSignName&quot;:&quot;阿里云&quot;,
     *        &quot;cardType&quot;:5,
     *        &quot;companyName&quot;: &quot;投放企业名称&quot;
     * }</p>
     */
    @NameInMap("Template")
    public java.util.Map<String, ?> template;

    /**
     * <p>The name of the card SMS template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云图文类模板</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateCardSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateRequest self = new CreateCardSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateRequest setFactorys(String factorys) {
        this.factorys = factorys;
        return this;
    }
    public String getFactorys() {
        return this.factorys;
    }

    public CreateCardSmsTemplateRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateCardSmsTemplateRequest setTemplate(java.util.Map<String, ?> template) {
        this.template = template;
        return this;
    }
    public java.util.Map<String, ?> getTemplate() {
        return this.template;
    }

    public CreateCardSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
